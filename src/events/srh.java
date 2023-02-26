package events;

import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;
import javax.swing.tree.DefaultMutableTreeNode;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class srh {
	Document contenitoreTotale;	
	Document contenitore2;
	Elements contenitoreHref;
    
	private DefaultMutableTreeNode nodo;
	private JEditorPane textPane;
	

public srh (DefaultMutableTreeNode nodo , JEditorPane textPane ) {
	
	 this.nodo = nodo;
	 this.textPane = textPane;
	 
}

public void fai() {
	
	textPane.setText(" ");
	
	try {
        String indirizzo=('"'+nodo.toString()+'"');
        System.out.println(indirizzo);
		contenitoreTotale = Jsoup.connect(nodo.toString()).ignoreHttpErrors(true).timeout(1000000*5).get();    
        contenitoreHref = contenitoreTotale.select("a[href]");}
	catch(Exception e){ System.out.println(e);}
	try {
	for (Element listapagine : contenitoreHref){
	    String pagina = listapagine.absUrl("href");
	    if(pagina.contains("jpg")){
	    	
	    	
	    	HTMLDocument doc=(HTMLDocument) textPane.getDocument();
	    	try {
				doc.insertAfterEnd(doc.getCharacterElement(doc.getLength()),"<html><a href="+pagina+"><img src="+pagina+" width='200' height='300'/></a></html>");
			} catch (BadLocationException | IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}	
	    	
	    }
	    DefaultMutableTreeNode aggiunta=new DefaultMutableTreeNode(pagina);
	    
	    
	    nodo.add(aggiunta);
	}
	}catch(Exception e){ System.out.println(e);}
	
    // code to be executed
  }
}
