import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUI {
	public static void main(String[] args) {
		new GUI();
		}
		public GUI(){
			 JFrame myFrame = new JFrame();
		        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        myFrame.setTitle("GoodWill");
		        myFrame.setSize(400,300);
		        
		        String[] homeOptions = {"Appliance", "Furniture",
		                 "Electronics","Supplies", "Clothes"};
		        
		        String[] activities = { "books", "equiptment", "paint", 
		                 "decor", "carpet"};
		        //The first JPanel contains a JLabel and JCombobox
		        final JPanel list = new JPanel();
		        JLabel productList = new JLabel("View products:");
		        JComboBox fruits = new JComboBox(homeOptions);
		        
		        list.setBackground(Color.cyan);
		        list.add(productList);
		        list.add(fruits);
		        
		        //List format
		        final JPanel listPanel = new JPanel();
		        listPanel.setVisible(false);//shows options on other panel
		        JLabel listVeg = new JLabel("Hobbies:");
		        JList vegs = new JList(activities);
		         listPanel.setBackground(Color.PINK);
		        listPanel.add(listVeg);
		        listPanel.add(vegs);
		        
		        JButton productButton = new JButton( "Click for other items ");
		        productButton.setBackground(Color.magenta);
		        productButton.addActionListener(new ActionListener()
		        {
		            
		            public void actionPerformed(ActionEvent event)
		            {
		               //one or the other
		               listPanel.setVisible(!listPanel.isVisible());
		               list.setVisible(!list.isVisible());

		            }
		        });

		        myFrame.add(list, BorderLayout.NORTH);
		        myFrame.add(listPanel, BorderLayout.CENTER);
		        myFrame.add(productButton,BorderLayout.SOUTH);
		        myFrame.setVisible(true);
		    }
}
