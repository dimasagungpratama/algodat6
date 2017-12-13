/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work6;

/**
 *
 * @author Dimas
 */
public class BinaryTreeNode {
    Object element;
    BinaryTreeNode leftChild;
    BinaryTreeNode rightChild;
    public BinaryTreeNode(){}
    public BinaryTreeNode(Object theElement){
        element = theElement;
    }
    public BinaryTreeNode(Object theElement,BinaryTreeNode theleftChild,BinaryTreeNode therightChild){
        element = theElement;
        leftChild = theleftChild;
        rightChild = therightChild;
    }
    
}
