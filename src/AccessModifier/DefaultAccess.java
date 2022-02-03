package AccessModifier;

class DefaultAccess {
    void display(String str){
        System.out.println(str);
    } 

    protected void protectedDisplay(){
        display("I'm PROTECTED!");
    }
    
    private void privateDisplay(){
        System.out.println("I'm Private");
    }

    
}