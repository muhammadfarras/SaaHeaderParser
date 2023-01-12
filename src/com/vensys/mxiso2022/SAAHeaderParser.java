package com.vensys.mxiso2022;
import com.vensys.mxiso2022.data.SAAHeader;
import com.vensys.mxiso2022.data.TagHeader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class SAAHeaderParser extends SAAHeader implements TagHeader {



    public SAAHeaderParser(String path) throws ParserConfigurationException, IOException, SAXException, Exception {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        // get the document
        Document document = builder.parse(new File(path));
        document.getDocumentElement().normalize();

        // header root
        String headerRoot = document.getDocumentElement().getNodeName();

        if (!headerRoot.equalsIgnoreCase("Saa:DataPDU")){
            throw new Exception("Root Header SAA tidak Valid");
        }
        NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getNodeName());

        // parses
        for (int i = 0 ; i < nodeList.getLength() ; i++){
            Node node = nodeList.item(i);

            if (node.getNodeType() == Node.ELEMENT_NODE){

                setSenderReference(SetValue(senderReference,node));

                setMessageIdentifier(SetValue(messageIdentifier,node));

                setFormat(SetValue(format,node));

                setSubFormat(SetValue(subFormat,node));

                setSeqNr(SetValue(seqNr,node));

                setSessionNr(SetValue(sessionNr, node));

                setSenderFullName(setDeepValues(Arrays.asList(Sender.Root,Sender.fullName), node));

                setReceiverFullName(setDeepValues(Arrays.asList(Receiver.Root,Receiver.fullName), node));

                setSnFInputTime(SetValue(snFInputTime, node));

                setExpiryDateTime(SetValue(expiryDateTime, node));

                setPriority(SetValue(priority, node));

            }
        }
    }

    /**
     *
     * @param headerTagSaa
     * @param node
     * @return Nilai dari isi an tag header yang dipilih
     */
    protected String SetValue(String headerTagSaa, Node node){
        Element element = (Element) node;
        NodeList nodeList = element.getElementsByTagName(headerTagSaa);
        if (nodeList.getLength() > 0){
            return nodeList.item(0).getTextContent();
        }
        return "Not Provided!!!";
    }

    protected String setDeepValues(List<String> headerTagSaa, Node node){

        Element element = (Element) node;
        NodeList nodeList = element.getElementsByTagName(headerTagSaa.get(0));
        if (nodeList.getLength() > 0){
            for (int a = 0 ; a < nodeList.getLength(); a++){
                Element deep1 = (Element) nodeList.item(a);
                if (deep1.getNodeType() == Node.ELEMENT_NODE){

                    Element deepElement = (Element)  deep1;
                    NodeList nodeList1 = deepElement.getElementsByTagName("Saa:X1");

                    if (nodeList1.getLength() > 0){
                        return nodeList1.item(0).getTextContent();
                    }
                }
            }

        }
        return "Not Provided!!!";
    }
}
