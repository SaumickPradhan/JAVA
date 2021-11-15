public class WordPile
{
  char ch[] = new char[20];
  int capacity, top;
  WordPile(int cap)
  {
    capacity = cap ; 
    top = -1;
    ch = new char[capacity];
   
  }
  
  void pushChar(char v)
  {
    if(top<capacity-1)
    
      ch[++top]=v;
     
    else
      System.out.println("WordPile is full");
    
  }
  char popChar()
  {
    if(top>=0)
      return ch[top--];
    else
      return('/');

  }
}