package edu.cgcc.cs260;

public class Playlist {

	public static void main(String[] args) {
		//instantiate new song play list
		SList songPlaylist = new SList();
		
		songPlaylist.insert("White and Nerdy");
		songPlaylist.insert("Basket Case");
		songPlaylist.insert("Pompeii");
		
		songPlaylist.print();
		System.out.println("\n\n\n");
		
		songPlaylist.removeByKey(0);
		songPlaylist.removeByKey(0);
		songPlaylist.removeByKey(0);
		songPlaylist.print();
	}

}
