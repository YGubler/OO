import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Stream {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileOutputStream fos= new FileOutputStream("basictypes.bin");
		try (DataOutputStream stream = new DataOutputStream(fos)) {
		stream.writeBoolean(true);
		stream.writeBoolean(false);
		stream.writeByte(255);
		stream.writeChar('\u0123');
		stream.writeShort(0x0910);
		stream.writeInt(0x01020304);
		stream.writeLong(0x1011121314151617L);
		stream.writeFloat((float)Math.PI);
		stream.writeDouble(1.0/0.0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	

	}

}