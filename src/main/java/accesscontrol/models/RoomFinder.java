package accesscontrol.models;

import accesscontrol.models.rooms.CommonArea;
import accesscontrol.models.rooms.IRoom;
import accesscontrol.models.rooms.Odc1;
import accesscontrol.models.rooms.Odc2;
import accesscontrol.models.rooms.Server;
import accesscontrol.models.rooms.Ups;

public class RoomFinder
{
    public static IRoom getRoomByName(String room)
    {
        return getRoom(room);
    }

    private static IRoom getRoom(String roomName)
    {
        IRoom room = null;
        if(roomName.equals(Server.SERVER.toLowerCase()))
              room = new Server();
        if(roomName.equals(CommonArea.COMMOONAREA.toLowerCase()))
            room = new CommonArea();
        if(roomName.equals(Ups.UPS.toLowerCase()))
            room = new Ups();
        if(roomName.equals(Server.SERVER.toLowerCase()))
            room = new Server();
        if(roomName.equals(Odc1.ODC1.toLowerCase()))
            room = new Odc1();
        if(roomName.equals(Odc2.ODC2.toLowerCase()))
            room = new Odc2();
        return room;
    }
}
