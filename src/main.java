import com.vensys.mxiso2022.SAAHeaderParser;
import com.vensys.mxiso2022.data.TagHeader;

import java.io.File;

public class main {
    public static void main(String[] args) {
        String path = "Pacs.008-test.xml";
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
                "<Saa:DataPDU xmlns:Saa=\"urn:swift:saa:xsd:saa.2.0\" xmlns:Sw=\"urn:swift:snl:ns.Sw\" xmlns:SwInt=\"urn:swift:snl:ns.SwInt\" xmlns:SwGbl=\"urn:swift:snl:ns.SwGbl\" xmlns:SwSec=\"urn:swift:snl:ns.SwSec\">\n" +
                "\t<Saa:Revision>2.0.13</Saa:Revision>\n" +
                "\t<Saa:Header>\n" +
                "\t\t<Saa:Message>\n" +
                "\t\t\t<Saa:SenderReference>OMHCCIDJAXXX008TC01.03$22080414</Saa:SenderReference>\n" +
                "\t\t\t<Saa:MessageIdentifier>pacs.008.001.08</Saa:MessageIdentifier>\n" +
                "\t\t\t<Saa:Format>MX</Saa:Format>\n" +
                "\t\t\t<Saa:SubFormat>Output</Saa:SubFormat>\n" +
                "\t\t\t<Saa:Sender>\n" +
                "\t\t\t\t<Saa:DN>ou=xxx,o=mhccidja,o=swift</Saa:DN>\n" +
                "\t\t\t\t<Saa:FullName>\n" +
                "\t\t\t\t\t<Saa:X1>MHCCIDJAXXX</Saa:X1>\n" +
                "\t\t\t\t\t<Saa:X2>xxx</Saa:X2>\n" +
                "\t\t\t\t</Saa:FullName>\n" +
                "\t\t\t</Saa:Sender>\n" +
                "\t\t\t<Saa:Receiver>\n" +
                "\t\t\t\t<Saa:DN>ou=xxx,o=mhccidja,o=swift</Saa:DN>\n" +
                "\t\t\t\t<Saa:FullName>\n" +
                "\t\t\t\t\t<Saa:X1>MHCCIDJAXXX</Saa:X1>\n" +
                "\t\t\t\t\t<Saa:X2>xxx</Saa:X2>\n" +
                "\t\t\t\t</Saa:FullName>\n" +
                "\t\t\t</Saa:Receiver>\n" +
                "\t\t\t<Saa:InterfaceInfo>\n" +
                "\t\t\t\t<Saa:UserReference>TC01.03</Saa:UserReference>\n" +
                "\t\t\t\t<Saa:MessageCreator>SWIFTNetInterface</Saa:MessageCreator>\n" +
                "\t\t\t\t<Saa:MessageContext>Copy</Saa:MessageContext>\n" +
                "\t\t\t\t<Saa:MessageNature>Financial</Saa:MessageNature>\n" +
                "\t\t\t\t<Saa:Sumid>1D147B1AFFFFFFF1</Saa:Sumid>\n" +
                "\t\t\t\t<Saa:ServiceURI>mp/mx/_ImGiIFKDEeyXX57HMRFmxw</Saa:ServiceURI>\n" +
                "\t\t\t\t<Saa:MessageTypeURI>mp/mx/_GqOv4GFsEeyeS-wGmaFOhQ/_GqP-AGFsEeyeS-wGmaFOhQ</Saa:MessageTypeURI>\n" +
                "\t\t\t</Saa:InterfaceInfo>\n" +
                "\t\t\t<Saa:NetworkInfo>\n" +
                "\t\t\t\t<Saa:Priority>Normal</Saa:Priority>\n" +
                "\t\t\t\t<Saa:IsPossibleDuplicate>true</Saa:IsPossibleDuplicate>\n" +
                "\t\t\t\t<Saa:DuplicateHistory>\n" +
                "\t\t\t\t\t<Saa:PDM>\n" +
                "            &lt;Sw:SnFDeliveryInfo&gt;\n" +
                "                &lt;Sw:SwiftTime&gt;2022-08-04T08:31:03Z&lt;/Sw:SwiftTime&gt;\n" +
                "                &lt;SwSec:UserDN&gt;cn=finuser2,o=MHCCIDJA,o=swift&lt;/SwSec:UserDN&gt;\n" +
                "                &lt;Sw:SnFSessionId&gt;MHCCIDJA_finplusfut!p:p:000009&lt;/Sw:SnFSessionId&gt;\n" +
                "                &lt;SwInt:SNLId&gt;snl50454&lt;/SwInt:SNLId&gt;\n" +
                "                &lt;Sw:RetryReason&gt;\n" +
                "                    &lt;SwGbl:StatusAttributes&gt;\n" +
                "                        &lt;SwGbl:Severity&gt;Transient&lt;/SwGbl:Severity&gt;\n" +
                "                        &lt;SwGbl:Code&gt;Sw.Gbl.InternalError&lt;/SwGbl:Code&gt;\n" +
                "                        &lt;SwGbl:Text&gt;Call to server application failed&lt;/SwGbl:Text&gt;\n" +
                "                    &lt;/SwGbl:StatusAttributes&gt;\n" +
                "                &lt;/Sw:RetryReason&gt;\n" +
                "            &lt;/Sw:SnFDeliveryInfo&gt;\n" +
                "        </Saa:PDM>\n" +
                "\t\t\t\t</Saa:DuplicateHistory>\n" +
                "\t\t\t\t<Saa:Service>swift.finplus!pf</Saa:Service>\n" +
                "\t\t\t\t<Saa:Network>SWIFTNet</Saa:Network>\n" +
                "\t\t\t\t<Saa:SessionNr>000009</Saa:SessionNr>\n" +
                "\t\t\t\t<Saa:SeqNr>000000021</Saa:SeqNr>\n" +
                "\t\t\t\t<Saa:TranslatedResult>Success</Saa:TranslatedResult>\n" +
                "\t\t\t\t<Saa:TranslationResultDetails>TranslationInfo version 1.0.0.1</Saa:TranslationResultDetails>\n" +
                "\t\t\t\t<Saa:SWIFTNetNetworkInfo>\n" +
                "\t\t\t\t\t<Saa:RequestType>pacs.008.001.08</Saa:RequestType>\n" +
                "\t\t\t\t\t<Saa:RequestSubtype>swift.gpi.swiftgo.01</Saa:RequestSubtype>\n" +
                "\t\t\t\t\t<Saa:SWIFTRef>swi00001-2022-08-04T08:31:03.10290.090538Z</Saa:SWIFTRef>\n" +
                "\t\t\t\t\t<Saa:SNLRef>SNL50454-2022-08-04T08:31:03.1660.000504Z</Saa:SNLRef>\n" +
                "\t\t\t\t\t<Saa:Reference>0fba8228-13cf-41ed-9a75-421ad4d03272</Saa:Reference>\n" +
                "\t\t\t\t\t<Saa:SnFQueueName>MHCCIDJA_finplusfut!p</Saa:SnFQueueName>\n" +
                "\t\t\t\t\t<Saa:SnFInputTime>0301:2022-08-04T08:31:03</Saa:SnFInputTime>\n" +
                "\t\t\t\t\t<Saa:SnFDeliveryTime>2022-08-04T08:31:52Z</Saa:SnFDeliveryTime>\n" +
                "\t\t\t\t\t<Saa:ValidationDescriptor>\n" +
                "\t\t\t\t\t\t<SwInt:ValResult>Success</SwInt:ValResult>\n" +
                "\t\t\t\t\t</Saa:ValidationDescriptor>\n" +
                "\t\t\t\t</Saa:SWIFTNetNetworkInfo>\n" +
                "\t\t\t</Saa:NetworkInfo>\n" +
                "\t\t\t<Saa:SecurityInfo>\n" +
                "\t\t\t\t<Saa:SWIFTNetSecurityInfo>\n" +
                "\t\t\t\t\t<Saa:SignatureResult>Success</Saa:SignatureResult>\n" +
                "\t\t\t\t\t<Saa:SignatureValue>\n" +
                "\t\t\t\t\t\t<SwSec:Signature>\n" +
                "\t\t\t\t\t\t\t<SwSec:SignedInfo>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>BJDCdQZ/QeFY3Z1VtTsmAC5Z2dMpvcxef8y3Be5yEJc=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t</SwSec:SignedInfo>\n" +
                "\t\t\t\t\t\t\t<SwSec:SignatureValue>PEMF@Proc-Type: 4,MIC-ONLY\n" +
                "Content-Domain: RFC822\n" +
                "EntrustFile-Version: 2.0\n" +
                "Originator-DN: cn=finuser2,o=MHCCIDJA,o=swift\n" +
                "Orig-SN: 1636325237\n" +
                "MIC-Info: SHA256, RSA,\n" +
                " hEidBlzNMJl9YuFnWqKJfp7Bp7th+hQXUsxk9Py//Kzl/GjzGl8oAtWKzbuNIIq4\n" +
                " CMUZ3wPTNqxqUmJp1IyrjOSH1eVwryjiuStcZcoq8hD/mtdB8Hv/y9W09kM1Q6w+\n" +
                " K37czDo5Pmimpt+5v5+B5OYulVO50/CmblFVR5QXUVBwBLpZnpSCUIhHDcaXlQfH\n" +
                " JwXMq4ueprKezicFQYaIiSBIk4gQjZBRi4LjpNMb3hQjk4HORqzfrfU8IANs2IV4\n" +
                " ezzLikzCSPnvIlAafv+FWxI1p+5MYUvWwnd9nxh5H1dQe0JPCT3ltv2aZzjHneym\n" +
                " Hl72K5mUCmIsPRdgWLdBJg==\n" +
                "</SwSec:SignatureValue>\n" +
                "\t\t\t\t\t\t\t<SwSec:KeyInfo>\n" +
                "\t\t\t\t\t\t\t\t<SwSec:SignDN>cn=finuser2,o=MHCCIDJA,o=swift</SwSec:SignDN>\n" +
                "\t\t\t\t\t\t\t\t<SwSec:CertPolicyId>1.3.21.6.2</SwSec:CertPolicyId>\n" +
                "\t\t\t\t\t\t\t</SwSec:KeyInfo>\n" +
                "\t\t\t\t\t\t\t<SwSec:Manifest>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestRef>Sw.RequestHeader</Sw:DigestRef>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>rUPb0uMhZvbyZKLSCE2MJ2ZU5430UfWdyIVs0cXolZ4=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestRef>Sw.RequestPayload</Sw:DigestRef>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>AH9Og+rfJEDNELaHPsQ5ARrvfxwfNbU0SzTpQ1b9DsU=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestRef>Sw.E2S</Sw:DigestRef>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>TZcETQYgBb0yPvhttkJmGd2C9ySaXMqx3Iv4EoEDKiI=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t</SwSec:Manifest>\n" +
                "\t\t\t\t\t\t</SwSec:Signature>\n" +
                "\t\t\t\t\t\t<SwSec:Signature>\n" +
                "\t\t\t\t\t\t\t<SwSec:SignedInfo>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>NlWToyXOeYV67ZUQ7WUCKZlBqkCu0md8x5PnL9YrnzI=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t</SwSec:SignedInfo>\n" +
                "\t\t\t\t\t\t\t<SwSec:SignatureValue>PEMF@Proc-Type: 4,MIC-ONLY\n" +
                "Content-Domain: RFC822\n" +
                "EntrustFile-Version: 2.0\n" +
                "Originator-DN: cn=%12,cn=sfm,o=swift,o=swift\n" +
                "Orig-SN: 1627179618\n" +
                "MIC-Info: SHA256, RSA,\n" +
                " ObuS63ix+qQRUvCWZKN+k1gzC5eMjvdS18D601YeC32bnqq+1rMjx7Ya66kzloEV\n" +
                " 8J+VFU06KgjHRjp2oMcAg2AvGbmMS/wimWVQ7vi/e7kFMpJMbJD/yiiaXJkp8yTH\n" +
                " u4ViML1Texw7oG8YO6OCsWP5j7B7KGS3aehBwMusPOb20icL6yl/txG0Zos4wxZa\n" +
                " fybztYhES5LpM65KUg351a4kw47GsRk1Al6f8uRM+0AryWuvUniiBCRCd/6ZuoWw\n" +
                " 1HL1GxFCkoFCWNNoUvHWP6nyoZgowwn3XEouUBCfcBGkpLCL7fs1gSXNdo72ajhH\n" +
                " +FAavmFIzbZkNZXHG0j84A==\n" +
                "</SwSec:SignatureValue>\n" +
                "\t\t\t\t\t\t\t<SwSec:KeyInfo>\n" +
                "\t\t\t\t\t\t\t\t<SwSec:SignDN>cn=%12,cn=sfm,o=swift,o=swift</SwSec:SignDN>\n" +
                "\t\t\t\t\t\t\t\t<SwSec:CertPolicyId>1.3.21.6.3.10.100.3</SwSec:CertPolicyId>\n" +
                "\t\t\t\t\t\t\t</SwSec:KeyInfo>\n" +
                "\t\t\t\t\t\t\t<SwSec:Manifest>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestRef>Sw.RequestHeader</Sw:DigestRef>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>rUPb0uMhZvbyZKLSCE2MJ2ZU5430UfWdyIVs0cXolZ4=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestRef>Sw.RequestPayload</Sw:DigestRef>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>AH9Og+rfJEDNELaHPsQ5ARrvfxwfNbU0SzTpQ1b9DsU=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t<Sw:Reference>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestRef>Translated MT</Sw:DigestRef>\n" +
                "\t\t\t\t\t\t\t\t\t<Sw:DigestValue>5YiefxHQF03N3eLKSLFVhMASXN+V7c5JJPl1JGSdKbA=</Sw:DigestValue>\n" +
                "\t\t\t\t\t\t\t\t</Sw:Reference>\n" +
                "\t\t\t\t\t\t\t</SwSec:Manifest>\n" +
                "\t\t\t\t\t\t</SwSec:Signature>\n" +
                "\t\t\t\t\t</Saa:SignatureValue>\n" +
                "\t\t\t\t</Saa:SWIFTNetSecurityInfo>\n" +
                "\t\t\t</Saa:SecurityInfo>\n" +
                "\t\t\t<Saa:ExpiryDateTime>20220824083134</Saa:ExpiryDateTime>\n" +
                "\t\t</Saa:Message>\n" +
                "\t</Saa:Header>\n" +
                "\t<Saa:Body>\n" +
                "    <AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\">\n" +
                "        <Fr>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>PINBIDJ0XXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </Fr>\n" +
                "        <To>\n" +
                "            <FIId>\n" +
                "                <FinInstnId>\n" +
                "                    <BICFI>PINBIDJ0XXX</BICFI>\n" +
                "                </FinInstnId>\n" +
                "            </FIId>\n" +
                "        </To>\n" +
                "        <BizMsgIdr>TEST-001</BizMsgIdr>\n" +
                "        <MsgDefIdr>pacs.008.001.08</MsgDefIdr>\n" +
                "        <BizSvc>swift.cbprplus.02</BizSvc>\n" +
                "        <CreDt>9999-12-31T00:00:00+00:00</CreDt>\n" +
                "    </AppHdr>\n" +
                "    <Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:pacs.008.001.08\">\n" +
                "        <FIToFICstmrCdtTrf>\n" +
                "            <GrpHdr>\n" +
                "                <MsgId>TEST-001</MsgId>\n" +
                "                <CreDtTm>9999-12-31T00:00:00+00:00</CreDtTm>\n" +
                "                <NbOfTxs>1</NbOfTxs>\n" +
                "                <SttlmInf>\n" +
                "                    <SttlmMtd>INDA</SttlmMtd>\n" +
                "                </SttlmInf>\n" +
                "            </GrpHdr>\n" +
                "            <CdtTrfTxInf>\n" +
                "                <PmtId>\n" +
                "                    <InstrId>TEST-001</InstrId>\n" +
                "                    <EndToEndId>NOTPROVIDED</EndToEndId>\n" +
                "                    <UETR>529607ec-a147-4870-b218-c8a580ea8d58</UETR>\n" +
                "                </PmtId>\n" +
                "                <PmtTpInf>\n" +
                "                    <SvcLvl>\n" +
                "                        <Cd>G001</Cd>\n" +
                "                    </SvcLvl>\n" +
                "                </PmtTpInf>\n" +
                "                <IntrBkSttlmAmt Ccy=\"USD\">3000.12</IntrBkSttlmAmt>\n" +
                "                <IntrBkSttlmDt>2022-10-10</IntrBkSttlmDt>\n" +
                "                <ChrgBr>SHAR</ChrgBr>\n" +
                "                <InstgAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>PINBIDJ0XXX</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </InstgAgt>\n" +
                "                <InstdAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>PINBIDJ0XXX</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </InstdAgt>\n" +
                "                <Dbtr>\n" +
                "                    <Nm>NIUM PTE. LTD - NIUM/INSTAREM - CMA</Nm>\n" +
                "                    <PstlAdr>\n" +
                "                        <AdrLine>16 RAFFLES QUAY 20-05 HONG LEONG</AdrLine>\n" +
                "                        <AdrLine>BUILDING SINGAPORE 048581</AdrLine>\n" +
                "                    </PstlAdr>\n" +
                "                </Dbtr>\n" +
                "                <DbtrAcct>\n" +
                "                    <Id>\n" +
                "                        <Othr>\n" +
                "                            <Id>2000496328</Id>\n" +
                "                        </Othr>\n" +
                "                    </Id>\n" +
                "                </DbtrAcct>\n" +
                "                <DbtrAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>PINBIDJ0XXX</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </DbtrAgt>\n" +
                "                <CdtrAgt>\n" +
                "                    <FinInstnId>\n" +
                "                        <BICFI>PINBIDJ0XXX</BICFI>\n" +
                "                    </FinInstnId>\n" +
                "                </CdtrAgt>\n" +
                "                <Cdtr>\n" +
                "                    <Nm>KHOUW SIN SIANG,DR</Nm>\n" +
                "                    <PstlAdr>\n" +
                "                        <AdrLine>JL.SLT HASANUDIM NO.43 MELAWAI</AdrLine>\n" +
                "                        <AdrLine>KEBAYORAN BARU</AdrLine>\n" +
                "                        <AdrLine>KOTA JAKARTA SELATAN</AdrLine>\n" +
                "                    </PstlAdr>\n" +
                "                </Cdtr>\n" +
                "                <CdtrAcct>\n" +
                "                    <Id>\n" +
                "                        <Othr>\n" +
                "                            <Id>111111WELLDONE TRADING HK LIMITED 72644048 HK1111</Id>\n" +
                "                        </Othr>\n" +
                "                    </Id>\n" +
                "                </CdtrAcct>\n" +
                "                <InstrForNxtAgt>\n" +
                "                    <InstrInf>/BNF/PY27319246 IMP OF FOOD STUFFS</InstrInf>\n" +
                "                </InstrForNxtAgt>\n" +
                "                <RmtInf>\n" +
                "                    <Ustrd>WELLDONE TRADING HK LIMITED 72644048 HK B4 1ST FLOOR WAH TAK BUILDING NO 1A1J WATERLOO RAOD YAU MA TEI KOWLOO</Ustrd>\n" +
                "                </RmtInf>\n" +
                "            </CdtTrfTxInf>\n" +
                "        </FIToFICstmrCdtTrf>\n" +
                "    </Document>\n" +
                "\t</Saa:Body>\n" +
                "</Saa:DataPDU>";

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

            System.out.println(saaHeaderParser.getHeaderSAAFull());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
