/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fire.occurence;

/**
 *
 * @author sara
 */
public class FireOccurenceList {

    private FireOccurenceNode head;
    private String recordFileDirectory;
    File file;

    FireOccurenceList(){
	head=null;
    }

    public void appendNode(FireOccurenceNode data){
        FireOccurenceNode node= data;

        if (head==null){
            head = node;
        }else{
        FireOccurenceNode fire=head;
        while(fire.nextFireOccurence !=null){
            fire=fire.nextFireOccurence;
        }
        fire.nextFireOccurence=node;
        }
        FireOccurenceNode.TotalFireOccurences++;
    }

    public FireOccurenceNode getNode(int id){
        FireOccurenceNode node=head;

        while(node.nextFireOccurence !=null){
            if (node.getFireId()== id){
                return node;
            }
            node=node.nextFireOccurence;
        }
        if (node.getFireId()== id){
            return node;
        }
        return null;
    }

    public void deleteNode(int id){
      if(id==1){
        FireOccurenceNode newHead=head;
        head=newHead.nextFireOccurence;
        newHead.nextFireOccurence=null;
      }else if(id == FireOccurenceNode.TotalFireOccurences){
            FireOccurenceNode previous=head;
            for(int i=1;i<FireOccurenceNode.TotalFireOccurences;i++){
                previous=previous.nextFireOccurence; 
            }
            previous.nextFireOccurence=null;

      }else{
            FireOccurenceNode previous=head;
            int count=FireOccurenceNode.TotalFireOccurences -id;
            while(count<(id-1)){
                previous=previous.nextFireOccurence;    
                count++;
            }
            FireOccurenceNode current=previous.nextFireOccurence;
            previous.nextFireOccurence=current.nextFireOccurence;
            current.nextFireOccurence=null;
      }
      FireOccurenceNode.TotalFireOccurences--; 

    }

    public void setRecordFileDirectory(String fileDirectory){
       
    }

    public String getHistoryContent(){

    }

    public void recordData() {
    
    }

    public void openHistory(){

    }

}
