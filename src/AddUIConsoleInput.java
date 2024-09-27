import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class AddUIConsoleInput {

    //fields
    PrintWriter stdOut = null;
    BufferedReader stdIn = null;
    AddUseCaseControl addUseCaseControl = null;

    //methods
    AddUIConsoleInput(){
        stdOut = new PrintWriter(
            new BufferedWriter(
                new OutputStreamWriter(System.out)
            ), true
        );

        stdIn = new BufferedReader(
            new InputStreamReader(System.in));

        //khởi tạo đói tượn g UseCase
        addUseCaseControl = new AddUseCaseControl();

    }

    public void input() throws IOException{
        stdOut.print("Input number1:");
        stdOut.flush();
        String strNumber1 = stdIn.readLine();
        stdOut.print("Input number2:");
        stdOut.flush();
        String strNumber2 = stdIn.readLine();

        RequestData requestData = new RequestData();
        requestData.strNumber1 = strNumber1;
        requestData.strNumber2 = strNumber2;
        //message to UseCasse
        addUseCaseControl.execute(requestData);

    }

}
