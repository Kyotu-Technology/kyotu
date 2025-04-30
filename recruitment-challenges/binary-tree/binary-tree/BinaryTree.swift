//
//  BinaryTree.swift
//  binary-tree
//
//  Created by Konrad Pagacz on 30/04/2025.
//
//

import SwiftUI

@propertyWrapper
class Ref<T> {
    var wrappedValue: T
    init (wrappedValue: T) {
        self.wrappedValue = wrappedValue
    }
}

struct Node {
    var value: Int
    @Ref var left: Node?
    @Ref var right: Node?
    
    init(_ value: Int) {
        self.value = value
    }
    init (_ value: Int, _ left: Node?, _ right: Node?) {
        self.value = value
        self.left = left
        self.right = right
    }
}

extension Node {
    func invertBinaryTree() {
        // TODO: Implement
    }
}
