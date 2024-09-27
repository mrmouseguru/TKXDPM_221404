public class AddUseCaseControl {
    //fields
    AddEntity addEntity = null;
    AddUIConsoleOutput addUIConsoleOutput = null;
    ResponseData responseData = null;
    AddUseCaseControl(){
        addEntity = new AddEntity();
        addUIConsoleOutput = new AddUIConsoleOutput();
        responseData = new ResponseData();
    }

    //methods
    public void execute(RequestData requestData){
        //nhận 2 số
       if(this.isInteger(requestData.strNumber1) && 
        this.isInteger(requestData.strNumber2)){
            //họp lệ
        addEntity.setNumber1(Integer.parseInt(requestData.strNumber1));
        addEntity.setNumber2(Integer.parseInt(requestData.strNumber2));

       int ketQua =  this.addEntity.add();
            responseData.result = ketQua;

           // addUIConsoleOutput.output(responseData);

        }else{
            //khong hợp lệ
            
            responseData.error = "KHONG_HOP_LE";
            responseData.strNumber1 = requestData.strNumber1;
            responseData.strNumber2 = requestData.strNumber2;
            
            //6
           // addUIConsoleOutput.output(responseData);
        }
        //thẩm định hợp lệ
        //hợp lệ - gửi meessage đến Entity
        //addEntity.add();
        //không hợp lệ
        addUIConsoleOutput.output(responseData);
        
    }

    public boolean isInteger(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str); // cố gắng chuyển chuỗi sang số nguyên
            return true; // nếu thành công thì chuỗi là số nguyên
        } catch (NumberFormatException e) {
            return false; // nếu có lỗi NumberFormatException thì không phải số nguyên
        }
    }



}
