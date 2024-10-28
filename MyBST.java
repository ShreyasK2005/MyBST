import java.util.*;
public class MyBST
{
  private BSTNode root;
  private class BSTNode 
  {
    public Integer val;
    public BSTNode left, right;
   
    public BSTNode(Integer val) 
    {
      this.val = val;
      left = right = null;
    }
   
    @Override
    public String toString() 
    { 
      return "" + this.val;
    }
  }
   public int size()
   {
     return size(root);
   } 
   public int size(BSTNode s)
   {
     if(s == null)
     {
       return 0;
     }
     return 1 + size(s.right) + size(s.left);
   }
   
   public void insert(Integer n)
   {
     root = i(root, n);
   }
   
   public BSTNode i(BSTNode s, Integer n)
   {
     if(s == null)
     {
       s = new BSTNode(n);
       return s;
     }
     if (n < s.val)
     {
       s.left = i(s.left, n);
     }
     else if(n>s.val)
     {
       s.right = i(s.right, n);
     }
     return s; 
   } 
   
   public boolean contains(Integer n)
   {
     return c(root, n);
   }
   
   public static boolean c(BSTNode s, Integer n)
   {
     if(s == null)
     {
       return false;
     }
     else if(s.val == n)
     {
       return true;
     }
     else if(s.val < n)
     {
       return c(s.right, n);
     }
     else if(s.val > n)
     {
      return c(s.left, n);
     }
     return c(s, n);
   }
   
   public Integer getMax()
   {
    return g(root);
   }
   public static Integer g(BSTNode s)
   {
     if(s == null)
     {
       return null;
     }
     else if(s.right != null)
     {
       return g(s.right);
     }
     return s.val;    
   }
   
   public Integer getMin()
   {
    return gM(root);
   }
   public static Integer gM(BSTNode s)
   {
     if(s == null)
     {
       return null;
     }
     else if(s.left != null)
     {
       return gM(s.left);
     }
     return s.val;    
   }
   
  private int findSmallestinSubtree(BSTNode s)
  {
    if(s == null)
     {
       return 0;
     }
     else if(s.left != null)
     {
       return gM(s.left);
     }
     return s.val;
  } 
  public void delete(Integer n)
  {
    d(root, n);
  }
  
  public BSTNode d(BSTNode s, Integer n)
  {
    if(s == null)
     {
       return s;
     }
     
     else if(s.val < n)
     {
       s.right = d(s.right, n);
     }
     
     else if(s.val > n)
     {
      s.left =  d(s.left, n);
     }
     
     else if(s.val == n)
     {
     
       if(s.right != null && s.left != null)
       {
         s.val = findSmallestinSubtree(s.right);
         s.right = d(s.right, s.val);
       }
       
       else if(s.right == null && s.left == null)
       {
         return null;
       }
       
       else if(s.right == null)
       {
         return s.left;
       }
       
       else if(s.left == null)
       {
         return s.right;
       }
     }
     return s; 
   }
   public void inOrder()
   {
     o(root);
   }
   public static void o(BSTNode s)
   {
     if(s == null)
     {
       return;
     }
     o(s.left);
     System.out.print(s.val + " ");
     o(s.right);
   }
   
   public void print()
   {
     p(root, 0, 1);
   }
   public static void p(BSTNode s, int spaces, int depth)
   {
     if (s == null)
     {
        return;
     } 
     spaces = 4 * depth;
     
     p(s.right, spaces, depth + 1);
     
     for (int i = 1; i < spaces; i++)
     {
       System.out.print(" ");
     } 
     
     System.out.print(s.val);
     System.out.print("\n");
     p(s.left, spaces, depth + 1);          
   }
}