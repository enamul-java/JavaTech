/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ehaque
 */
public class TestClassImpl {

    public static void main(String[] args) {
        
        pritHeapSpaceSizeAndMax();
        
        pritHeapSpace();
        
        TestClass tc = new TestClass();
        tc.hi();

        tc = new TestClass();
        tc = null;

        pritHeapSpace();

        System.gc();
        
        pritHeapSpace();
    }
    
    private static void pritHeapSpace(){
        // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
        long heapFreeSize = Runtime.getRuntime().freeMemory();
        
        System.out.println("");
        System.out.println("HeapFreeSize: "+ heapFreeSize);
    }
    
    private static void pritHeapSpaceSizeAndMax(){
        // Get current size of heap in bytes
        long heapSize = Runtime.getRuntime().totalMemory();

        // Get maximum size of heap in bytes. The heap cannot grow beyond this size.// Any attempt will result in an OutOfMemoryException.
        long heapMaxSize = Runtime.getRuntime().maxMemory();

        // Get amount of free memory within the heap in bytes. This size will increase // after garbage collection and decrease as new objects are created.
        long heapFreeSize = Runtime.getRuntime().freeMemory();
        
        System.out.println("");
        System.out.println("Heap Size: "+ heapSize);
        System.out.println("HeapMaxSize: "+ heapMaxSize);
    }
}
