//
//  BinaryTreeView.swift
//  binary-tree
//
//  Created by Konrad Pagacz on 30/04/2025.
//  
//

import SwiftUI

struct BinaryTreeView: View {
    let root: Node?

    var body: some View {
        // TODO: Implement
    }
}

#Preview {
    BinaryTreeView(root: Node(1))
}

#Preview {
    BinaryTreeView(root: Node(1, Node(2), Node(3)))
}
