package jforgame.socket.codec.reflect;

import java.nio.ByteBuffer;

import jforgame.socket.utils.ByteBuffUtil;

public class BooleanCodec extends Codec {

	@Override
	public Boolean decode(ByteBuffer in, Class<?> type, Class<?> wrapper) {
		return ByteBuffUtil.readBoolean(in);
	}

	@Override
	public void encode(ByteBuffer out, Object value, Class<?> wrapper) {
		ByteBuffUtil.writeBoolean(out, (boolean)value);
	}

}
