//
//  binary_treeTests.swift
//  binary-treeTests
//
//  Created by Konrad Pagacz on 30/04/2025.
//

import Testing
@testable import binary_tree

struct binary_treeTests {

    @Test func testInvertBinaryTree1() async throws {
        let root = Node(4)
        root.left = Node(2)
        root.right = Node(7)
        root.left?.left = Node(1)
        root.left?.right = Node(3)
        root.right?.left = Node(6)
        root.right?.right = Node(9)

        root.invertBinaryTree()

        #expect(root.value == 4)
        #expect(root.left?.value == 7)
        #expect(root.right?.value == 2)
        #expect(root.left?.left?.value == 9)
        #expect(root.left?.right?.value == 6)
        #expect(root.right?.left?.value == 3)
        #expect(root.right?.right?.value == 1)
    }

    @Test func testInvertBinaryTree2() async throws {
        let root = Node(4)
        root.left = Node(2)

        root.invertBinaryTree()

        #expect(root.value == 4)
        #expect(root.right?.value == 2)
    }

}
