package org.cryptomator.data.db.entities;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

@Entity
public class CloudEntity extends DatabaseEntity {

	@Id
	private Long id;

	@NotNull
	private String type;

	private String accessToken;

	private String url;

	private String username;

	private String webdavCertificate;

	@Generated(hash = 361171073)
	public CloudEntity(Long id, @NotNull String type, String accessToken, String url, String username, String webdavCertificate) {
		this.id = id;
		this.type = type;
		this.accessToken = accessToken;
		this.url = url;
		this.username = username;
		this.webdavCertificate = webdavCertificate;
	}

	@Generated(hash = 1354152224)
	public CloudEntity() {
	}

	public String getAccessToken() {
		return this.accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getWebdavCertificate() {
		return webdavCertificate;
	}

	public void setWebdavCertificate(String webdavCertificate) {
		this.webdavCertificate = webdavCertificate;
	}
}
