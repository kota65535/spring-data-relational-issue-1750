package com.kota65535.converter;

import org.springframework.core.convert.converter.Converter;
import java.nio.ByteBuffer;
import java.util.UUID;

public class UuidFromBin implements Converter<byte[], UUID> {

	@Override
	public UUID convert(byte[] source) {
		ByteBuffer byteBuffer = ByteBuffer.wrap(source);
		long high = byteBuffer.getLong();
		long low = byteBuffer.getLong();
		return new UUID(high, low);
	}
}

