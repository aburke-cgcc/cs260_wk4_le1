package edu.cgcc.cs260;

public class SList {
	//members
	Song head = null;
	
	//member functions
	public void insert(String name) {
		//Create a new song
		Song new_song = new Song(name);
		
		//if there isn't a head, make new_song as head
		if(this.head == null) {
			this.head = new_song;
		}
		//else put the song at the end of the list
		else {
			Song last = this.head;
			while(last.next != null) {
				last = last.next;
			}
			
			//insert the new_song at last position
			last.next = new_song;
		}
	}
	
	public void removeByKey(int id) {
		//start at first song and track prevSong
		Song currSong = this.head;
		Song prevSong = null;
		
		//Case 1:
		//first song holds the key to be deleted
		if(currSong != null && currSong.id == id) {
			this.head = currSong.next;
			
			System.out.println(currSong.name + "(" + currSong.id + ") found and deleted.");
			
			return;
		}
		
		//Case 2:
		//If the key is in some other node
		while(currSong != null && currSong.id != id) {
			//if currSong song does not hold key
			//continue to next song and track previous song
			prevSong = currSong;
			currSong = currSong.next;
		}
		
		//If the id is present, remove it
		if(currSong != null) {
			prevSong.next = currSong.next;
			
			//Display notice to user
			System.out.println(currSong.name + "(" + currSong.id + ") was found and deleted.");
		}
		
		//Case 3:
		//If the id wasn't found let us know
		if(currSong == null) {
			//Display notice
			System.out.println("(" + id + ") Song not found.");
		}
	}
	
	public void print() {
		Song currSong = this.head;
		
		System.out.println("Song List: ");
		
		//traverse through the song list
		while(currSong != null) {
			//print out song name to console
			System.out.print(currSong.name);
			System.out.print(",");
			
			//go to next node
			currSong = currSong.next;
		}
		System.out.println();
	}
}
