import com.vensys.mxiso2022.SAAHeaderParser;
import com.vensys.mxiso2022.data.TagHeader;

import java.io.File;

public class main {
    public static void main(String[] args) {
        String path = "Pacs.008-test.xml";
//        String path = "pacs.008-without-prefix-saa.xml";

        try {
            // Using File Path
            SAAHeaderParser saaHeaderParser = new SAAHeaderParser(new File(path));

            // Using XML String
            // SAAHeaderParser saaHeaderParser = new SAAHeaderParser(xml);

            System.out.println(String.format("%-25s %3s %30s", TagHeader.senderReference," : ",saaHeaderParser.getSenderReference()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.messageIdentifier," : ",saaHeaderParser.getMessageIdentifier()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.subFormat," : ",saaHeaderParser.getSubFormat()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.seqNr," : ",saaHeaderParser.getSeqNr()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.sessionNr," : ",saaHeaderParser.getSessionNr()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.Sender.fullName+" Sender"," : ",saaHeaderParser.getSenderFullName()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.Receiver.fullName+" Receiver"," : ",saaHeaderParser.getReceiverFullName()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.snFInputTime," : ",saaHeaderParser.getSnFInputTime()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.expiryDateTime," : ",saaHeaderParser.getExpiryDateTime()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.priority," : ",saaHeaderParser.getPriority()));
            System.out.println(String.format("%-25s %3s %30s", TagHeader.MessageUserReference.MUR," : ",saaHeaderParser.getMessageUserReference()));

//            System.out.println(saaHeaderParser.getHeaderSAAFull());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
