# CSCI212-Lab13
•The goal of this lab: 
a.use a HashMap in a simple program 
b.override methods at object creation 
c.use a JFileChooser 
•When the “select file” button is selected, the JFileChooser allows the user to select a file.  Use a HashMap to store the contents of the file, and print each word in the file and the number of times it occurs.  It is fine to just print the toString method from the HashMap.  
•The other button changes the background of the frame to a random color
•For the two buttons in the application, each button has its own ActionListener and the actionPerformed method for each button should be overridden when the ActionListener is added.  
•Here is an example of how to do this for each of the buttons: 
JButton button = new JButton("File Selector");
        //Add action listener to button
        button.addActionListener(new ActionListener() {
 
            public void actionPerformed(ActionEvent e)
            {
                //Execute when button is pressed
                System.out.println("You clicked the button");
            }
        });
