package org.cryptomator.data.cloud;

import org.cryptomator.data.cloud.crypto.CryptoCloudContentRepositoryFactory;
import org.cryptomator.data.cloud.dropbox.DropboxCloudContentRepositoryFactory;
import org.cryptomator.data.cloud.googledrive.GoogleDriveCloudContentRepositoryFactory;
import org.cryptomator.data.cloud.local.LocalStorageContentRepositoryFactory;
import org.cryptomator.data.cloud.onedrive.OnedriveCloudContentRepositoryFactory;
import org.cryptomator.data.cloud.pcloud.PCloudContentRepositoryFactory;
import org.cryptomator.data.cloud.webdav.WebDavCloudContentRepositoryFactory;
import org.cryptomator.data.repository.CloudContentRepositoryFactory;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

import javax.inject.Inject;
import javax.inject.Singleton;

import static java.util.Arrays.asList;

@Singleton
public class CloudContentRepositoryFactories implements Iterable<CloudContentRepositoryFactory> {

	private final Iterable<CloudContentRepositoryFactory> factories;

	@Inject
	public CloudContentRepositoryFactories(DropboxCloudContentRepositoryFactory dropboxFactory, //
			GoogleDriveCloudContentRepositoryFactory googleDriveFactory, //
			OnedriveCloudContentRepositoryFactory oneDriveFactory, //
			PCloudContentRepositoryFactory pCloudFactory, //
			CryptoCloudContentRepositoryFactory cryptoFactory, //
			LocalStorageContentRepositoryFactory localStorageFactory, //
			WebDavCloudContentRepositoryFactory webDavFactory) {

		factories = asList(dropboxFactory, //
				googleDriveFactory, //
				oneDriveFactory, //
				pCloudFactory, //
				cryptoFactory, //
				localStorageFactory, //
				webDavFactory);
	}

	@NotNull
	@Override
	public Iterator<CloudContentRepositoryFactory> iterator() {
		return factories.iterator();
	}
}
