package com.kota65535.converter;

import org.springframework.core.convert.converter.Converter;
import java.nio.ByteBuffer;
import java.util.UUID;

public class UuidToBin implements Converter<UUID, byte[]> {

	@Override
	public byte[] convert(UUID source) {
		ByteBuffer bb = ByteBuffer.wrap(new byte[16]);
		bb.putLong(source.getMostSignificantBits());
		bb.putLong(source.getLeastSignificantBits());
		return bb.array();
	}
}

