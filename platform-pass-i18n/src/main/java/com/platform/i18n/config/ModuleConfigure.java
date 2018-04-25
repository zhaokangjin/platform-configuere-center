package com.platform.i18n.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import com.platform.configure.env.KafkaConfigure;
import com.platform.configure.env.MongoConfigure;
import com.platform.configure.env.MySQLConfigure;
import com.platform.configure.env.OracleConfigure;
import com.platform.configure.env.RedisConfigure;

@Component
@ConfigurationProperties(prefix = "envconfigure")
public class ModuleConfigure {
	private KafkaConfigure kafkaConfigure;
	private MongoConfigure mongoConfigure;
	private MySQLConfigure mySqlConfigure;
	private OracleConfigure oracleConfigure;
	private RedisConfigure redisConfigure;
	private String gateWay;
	private String staticToken;
	public KafkaConfigure getKafkaConfigure() {
		return kafkaConfigure;
	}
	public void setKafkaConfigure(KafkaConfigure kafkaConfigure) {
		this.kafkaConfigure = kafkaConfigure;
	}
	public MongoConfigure getMongoConfigure() {
		return mongoConfigure;
	}
	public void setMongoConfigure(MongoConfigure mongoConfigure) {
		this.mongoConfigure = mongoConfigure;
	}

	public OracleConfigure getOracleConfigure() {
		return oracleConfigure;
	}
	public void setOracleConfigure(OracleConfigure oracleConfigure) {
		this.oracleConfigure = oracleConfigure;
	}
	public RedisConfigure getRedisConfigure() {
		return redisConfigure;
	}
	public void setRedisConfigure(RedisConfigure redisConfigure) {
		this.redisConfigure = redisConfigure;
	}
	public String getGateWay() {
		return gateWay;
	}
	public void setGateWay(String gateWay) {
		this.gateWay = gateWay;
	}
	public String getStaticToken() {
		return staticToken;
	}
	public void setStaticToken(String staticToken) {
		this.staticToken = staticToken;
	}
	public MySQLConfigure getMySqlConfigure() {
		return mySqlConfigure;
	}
	public void setMySqlConfigure(MySQLConfigure mySqlConfigure) {
		this.mySqlConfigure = mySqlConfigure;
	}

}
