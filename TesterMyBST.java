//Version 1.2
public class TesterMyBST extends TestGUI.TestData{ 
   public static void main (String[] args) {        
      new TestGUI();   
   }

   public static void runTests() {  //Your test sequence must be within a method called runTests()
      //WRITE ALL YOUR TEST CASES IN HERE       
      setTimeOutSec(3);
      srcButton("MyBST");
   
      // Newline Converter: https://onlinestringtools.com/convert-newlines-to-spaces
      // Object testMethod(String cName, String mName, Object[] args, [String expOut], [double allowableError], [String inputScript])
   
      header("MyBST");  
      message("Best possible score: 20 Green, 0 Yellow, 0 Red");
      Object o = makeObject("MyBST", new Object[]{});
      testMethod(o, "insert", new Object[]{3}); 
      testMethod(o, "insert", new Object[]{8}); 
      testMethod(o, "insert", new Object[]{1}); 
      testMethod(o, "insert", new Object[]{4}); 
      testMethod(o, "insert", new Object[]{0}); 
      testMethod(o, "insert", new Object[]{2}); 
      testMethod(o, "insert", new Object[]{9}); 
      testMethod(o, "insert", new Object[]{11}); 
      testMethod(o, "insert", new Object[]{5}); 
      
      testMethod(o, "size", new Object[]{}, "9"); 
      testMethod(o, "contains", new Object[]{4}, "true"); 
      testMethod(o, "contains", new Object[]{-1}, "false"); 
      
      testMethod(o, "getMin", new Object[]{}, "0"); 
      testMethod(o, "getMax", new Object[]{}, "11"); 
      
      testMethod(o, "print", new Object[]{}, "            11\n        9\n    8\n            5\n        4\n3\n        2\n    1\n        0"); 
      
      testMethod(o, "inOrder", new Object[]{}, "0 1 2 3 4 5 8 9 11"); 
      
      testMethod(o, "delete", new Object[]{10}); 
      testMethod(o, "print", new Object[]{}, "            11\n        9\n    8\n            5\n        4\n3\n        2\n    1\n        0"); 
   
      testMethod(o, "delete", new Object[]{2}); 
      testMethod(o, "print", new Object[]{}, "            11\n        9\n    8\n            5\n        4\n3\n    1\n        0"); 
   
      testMethod(o, "delete", new Object[]{1});
      testMethod(o, "print", new Object[]{}, "            11\n        9\n    8\n            5\n        4\n3\n    0"); 
   
      message("We are now going to delete the value 8, a node that has two children.  There's technically two ways to find a successor: get the largest value from the left subtree or get the smallest value from the right subtree.  To pass this test, please ensure that you are getting the smallest of the right.");
      testMethod(o, "delete", new Object[]{8});         
      testMethod(o, "print", new Object[]{}, "        11\n    9\n            5\n        4\n3\n    0\n\n"); 
   
      header("MyBST - Making a second tree to double check stuff");  
      o = makeObject("MyBST", new Object[]{});
      testMethod(o, "insert", new Object[]{5}); 
      testMethod(o, "insert", new Object[]{2}); 
      testMethod(o, "insert", new Object[]{6}); 
      testMethod(o, "insert", new Object[]{1}); 
      testMethod(o, "insert", new Object[]{3}); 
      testMethod(o, "insert", new Object[]{9}); 
   
      testMethod(o, "size", new Object[]{}, "6"); 
      testMethod(o, "contains", new Object[]{3}, "true"); 
      testMethod(o, "contains", new Object[]{8}, "false"); 
      
      testMethod(o, "getMin", new Object[]{}, "1"); 
      testMethod(o, "getMax", new Object[]{}, "9"); 
      
      testMethod(o, "print", new Object[]{}, "        9\n    6\n5\n        3\n    2\n        1"); 
      testMethod(o, "inOrder", new Object[]{}, "1 2 3 5 6 9 "); 
      
      testMethod(o, "delete", new Object[]{1}); 
      testMethod(o, "delete", new Object[]{2}); 
      testMethod(o, "delete", new Object[]{5}); 
      testMethod(o, "delete", new Object[]{9}); 
      testMethod(o, "print", new Object[]{}, "6\n    3"); 
      testMethod(o, "inOrder", new Object[]{}, "3 6"); 
   
   
      
   }    
}