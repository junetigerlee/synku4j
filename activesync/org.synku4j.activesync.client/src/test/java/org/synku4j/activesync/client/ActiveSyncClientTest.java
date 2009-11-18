package org.synku4j.activesync.client;

import java.net.URL;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import com.zynku.sync.activesync.context.ActiveSyncContext;
import com.zynku.sync.activesync.control.ActiveSyncController;
import com.zynku.sync.activesync.model.ActiveSyncApplicationData;

public class ActiveSyncClientTest {
	
	@Test(enabled=false)
	public void testController() throws Exception {
		BasicConfigurator.configure();
		
		ActiveSyncContext cntx = new ActiveSyncContext();
		cntx.setDeviceId("Appl9C808MH40JW");
		cntx.setUserName("zynkusync@googlemail.com");
		cntx.setPassword("badger9999");

		cntx.setDeviceId("Appl9C808MH40JW");
		cntx.setDeviceType("iPod");
		cntx.setServerURL(new URL("https://m.google.com/Microsoft-Server-ActiveSync"));
		
		
		final ActiveSyncController asController = new ActiveSyncController(cntx);
		List<ActiveSyncApplicationData> contacts = asController.getContacts();
		System.out.println("contacts = "+contacts.size());
	}
	

	@Test(enabled=true)
	public void testFolderSync() throws Exception {
		final URL serverURL = new URL("https://m.google.com/Microsoft-Server-ActiveSync");
		ActiveSyncClientContext cntx = new ActiveSyncClientContext();
		ActiveSyncClient client = new ActiveSyncClient("zynkusync","badger9999", serverURL, cntx);
		List<ActiveSyncApplicationData> contacts = client.getContacts();
	}
}

