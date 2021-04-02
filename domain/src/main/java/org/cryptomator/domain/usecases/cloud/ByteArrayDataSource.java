package org.cryptomator.domain.usecases.cloud;

import android.content.Context;

import org.cryptomator.util.Optional;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;

public class ByteArrayDataSource implements DataSource {

	private final byte[] bytes;

	private ByteArrayDataSource(byte[] bytes) {
		this.bytes = bytes;
	}

	public static DataSource from(byte[] bytes) {
		return new ByteArrayDataSource(bytes);
	}

	@Override
	public Optional<Long> size(Context context) {
		long size = bytes.length;
		return Optional.of(size);
	}

	@Override
	public Optional<Date> modifiedDate(Context context) {
		return Optional.empty();
	}

	@Override
	public InputStream open(Context context) throws IOException {
		return new ByteArrayInputStream(bytes);
	}

	@Override
	public DataSource decorate(DataSource delegate) {
		return delegate;
	}

	@Override
	public void close() throws IOException {
		// do nothing because ByteArrayInputStream need no close
	}
}
