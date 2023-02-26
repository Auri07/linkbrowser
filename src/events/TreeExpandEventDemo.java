package events;
 
/*
 * TreeExpandEventDemo.java requires no other files.
 */
 
import javax.swing.*;
import javax.swing.tree.*;



import javax.swing.event.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.html.HTMLDocument;

import java.awt.*;
import java.io.IOException;
 
public class TreeExpandEventDemo extends JPanel {
    DemoArea demoArea;
    static JEditorPane textPane;
    
    final static String newline = "\n";
 
    public TreeExpandEventDemo() {
        super(new GridBagLayout());
        GridBagLayout gridbag = (GridBagLayout)getLayout();
        GridBagConstraints c = new GridBagConstraints();
 
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.weightx = 1.0;
        c.weighty = 1.0;
 
        c.insets = new Insets(1, 1, 1, 1);
        demoArea = new DemoArea();
        gridbag.setConstraints(demoArea, c);
        add(demoArea);
 
        c.insets = new Insets(0, 0, 0, 0);
        textPane = new JEditorPane();
        textPane.setContentType("text/html");
        textPane.setEditable(false);
        textPane.setBackground(Color.BLACK);
        textPane.setEnabled(true);
        textPane.addHyperlinkListener(new HyperlinkListener() {
            public void hyperlinkUpdate(HyperlinkEvent e) {
                if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                    System.out.println(e.getURL());
                    System.out.println(e.getDescription());
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        desktop.browse(e.getURL().toURI());
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setVerticalScrollBarPolicy(
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(200, 75));
        gridbag.setConstraints(scrollPane, c);
        add(scrollPane);
 
        setPreferredSize(new Dimension(450, 450));
        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
    }
 
    private static class Selector implements TreeSelectionListener {
	    public void valueChanged(TreeSelectionEvent event) {
	      Object obj = event.getNewLeadSelectionPath().getLastPathComponent();
	      System.out.println("" + obj.toString());
	      DefaultMutableTreeNode node = (DefaultMutableTreeNode) obj;
	      srh oggetto = new srh(node,textPane);
		    oggetto.fai();
		    
	    }
	  }
    
   void saySomething(String eventDescription, TreeExpansionEvent e) {
    //	String abc ="https://cdni.pornpics.com/1280/7/446/76017477/76017477_011_b1e8.jpg";
    //	textPane.setText("<html><a href='https://cdni.pornpics.com/1280/7/446/76017477/76017477_011_b1e8.jpg'><img src="+abc+" width='200' height='300'/></a></html>");
    //	HTMLDocument doc=(HTMLDocument) textPane.getDocument();
    //	try {
	//		doc.insertAfterEnd(doc.getCharacterElement(doc.getLength()),"<b>Goodbye!</b>");
	//	} catch (BadLocationException | IOException e1) {
	//		// TODO Auto-generated catch block
	//		e1.printStackTrace();
	//	}
        //textArea.append(eventDescription + "; "
          //              + "path = " + e.getPath()
            //            + newline);
    }
 
    class DemoArea extends JScrollPane
                   implements TreeExpansionListener {
        Dimension minSize = new Dimension(100, 100);
        JTree tree;
     
        public DemoArea() {
            TreeNode rootNode = createNodes();
            tree = new JTree(rootNode);
            tree.addTreeExpansionListener(this);
            tree.getSelectionModel().addTreeSelectionListener(new Selector());
    	    tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
            setViewportView(tree);
            tree.setBackground(Color.BLACK);
        }
 
        private TreeNode createNodes() {
            DefaultMutableTreeNode root;
            DefaultMutableTreeNode grandparent;
            DefaultMutableTreeNode parent;
            DefaultMutableTreeNode child;
 
            root = new DefaultMutableTreeNode("PornSites");
 
            grandparent = new DefaultMutableTreeNode("http://sexygirlspics.com/");
            root.add(grandparent);
            //
            
             
            grandparent = new DefaultMutableTreeNode("http://viewgals.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("http://sex-pornpics.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("http://www.ifreepornpics.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://jjgirls.com/pornpics");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://www.pornpictureshq.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://www.coedcherry.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://pornpics2u.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://www.mixpornpics.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://imagxxx.com/en/porn-photos/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://www.pornpics.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("http://nastypornpics.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("http://www.hotpornphotos.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://lamalinks.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://nastypornpics.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://babesource.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://www.imagefap.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://allporn.pics/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("http://www.pornpicsamateur.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("https://foxygf.com/");
            root.add(grandparent);
            //
            
            grandparent = new DefaultMutableTreeNode("http://www.pornxxxpictures.com/");
            root.add(grandparent);
            //
            
            
            
             
            return root;
        }
     
        public Dimension getMinimumSize() {
            return minSize;
        }
 
        public Dimension getPreferredSize() {
            return minSize;
        }
 
        // Required by TreeExpansionListener interface.
        public void treeExpanded(TreeExpansionEvent e) {
            saySomething("Tree-expanded event detected", e);
        }
 
        // Required by TreeExpansionListener interface.
        public void treeCollapsed(TreeExpansionEvent e) {
            saySomething("Tree-collapsed event detected", e);
        }
    }
 
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TreeExpandEventDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Create and set up the content pane.
        JComponent newContentPane = new TreeExpandEventDemo();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
