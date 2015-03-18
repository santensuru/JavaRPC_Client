/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javarpc_client;

/**
 *
 * @author user
 */
public class JavaRPC_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        RPCClient messageRpc = new RPCClient();

        System.out.println(" [x] Requesting fib(30)");   
        String response = messageRpc.call("30");
        System.out.println(" [.] Got '" + response + "'");

        messageRpc.close();
    }
    
}
