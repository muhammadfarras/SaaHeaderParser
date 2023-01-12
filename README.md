# SAA Header Parser

> Dikembangkan oleh Venturiom System Indonesia

## Tag method yang tersedia
* Saa:SenderReference
* Saa:MessageIdentifier
* Saa:SubFormat
* Saa:SeqNr
* Saa:SessionNr
* Saa:FullName Sender
* Saa:FullName Receiver
* Saa:SnFInputTime
* Saa:ExpiryDateTime
* Saa:Priority

## Cara menggunakan
1. Import library yang dibutuhkan
```java
import com.vensys.mxiso2022.SAAHeaderParser;
import com.vensys.mxiso2022.data.TagHeader;
```

2. Buat *constructor* dengar argumen *absolute path*
```java
path = "absolute path.xml";
SAAHeaderParser saaHeaderParser = new SAAHeaderParser(path);
```

3. Ambil data yang dibutuhkan menggunakan method *get____*
```java
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
```

**Output**
```text
Saa:SenderReference        :  OMHCCIDJAXXX008TC01.03$22080414
Saa:MessageIdentifier      :                 pacs.008.001.08
Saa:SubFormat              :                          Output
Saa:SeqNr                  :                       000000021
Saa:SessionNr              :                          000009
Saa:FullName Sender        :                     MHCCIDJAXXX
Saa:FullName Receiver      :                     MHCCIDJAXXX
Saa:SnFInputTime           :        0301:2022-08-04T08:31:03
Saa:ExpiryDateTime         :                  20220824083134
Saa:Priority               :                          Normal
```