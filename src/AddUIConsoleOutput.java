import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleOutput {
    //fields
    PrintWriter stdOut = null;

    AddUIConsoleOutput(){
        stdOut = new 
        PrintWriter(new OutputStreamWriter(System.out));
    }


    public void output(ResponseData responseData) {

        stdOut.println("LOI TE LE");
        stdOut.flush();
        stdOut.println("ERROR: " + responseData.error +
         "" + responseData.strNumber1);
         stdOut.flush();
        
    }
}
