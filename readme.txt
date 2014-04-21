Download selenium server.jar from the SeleniumHQ website <http://selenium.googlecode.com/files/selenium-server-standalone-2.0rc2.jar> 
and place under server dir if one not exists.

=======================================================

Supported browsers include:
  *firefox
  *mock
  *firefoxproxy
  *pifirefox
  *chrome
  *iexploreproxy
  *iexplore
  *firefox3
  *safariproxy
  *googlechrome
  *konqueror
  *firefox2
  *safari
  *piiexplore
  *firefoxchrome
  *opera
  *iehta
  *custom
For web driver :
IE driver: iexplorerDriver 
IE driver with RC: iexplorerRemoteDriver
FF driver: firefoxDriver 
FF driver with RC: firefoxRemoteDriver
Note: As web-driver implementation are not thread safe will not work parallel with same system. 
If you are using remote web driver it is advisable to start selenium serever externally. 
======================
Data provider Utility
======================
To use CSV Data Provider in test annotation set following two attributes
	dataProvider="csvDataProvider"
	dataProviderClass=DataProviderUtil.class
For instance:
	@Test(dataProvider="csvDataProvider", dataProviderClass=DataProviderUtil.class)
	public void myTest(String csvCol1, String csvCol1){
	}
Now you need to specify the csv file name with url by providing following property in one of the properties file.
	test.<method_name>.datafile=<csv_datafile>
For instance, property to set for example above :
	test.myTest.datafile=resources/data/mytestdata.csv
mytestdata.csv must have valid comma separated values. in above example it assumes two cols.
While writing csv file you can provide comments by # as first char of line, also blank line will be ignored while parsing data from file

=====================================================================

Q: fails to start Firefox on Linux due to java.net.SocketException
sudo sysctl net.ipv6.bindv6only=0
http://code.google.com/p/selenium/wiki/FrequentlyAskedQuestions#Q:_fails_to_start_Firefox_on_Linux_due_to_java.net.
Q: Selenium server sometimes takes a long time to start a new session ?
A: If you're running on linux, you will need to increase the amount of entropy available for secure random number generation. Most linux distros can install a package called "randomsound" to do this.
On Windows (XP), you may be running into http://bugs.sun.com/view_bug.do?bug_id=6705872, which usually means clearing out a lot of files from your temp directory. temp directory. 

To work with swfUpload
Use flash-switcher extension and to set flash plug-in older version if required
http://blog.sephiroth.it/firefox-extensions/flash-switcher/
http://demo.swfupload.org/Documentation/#selectFile
for ie to get flash playe 9 visit http://kb2.adobe.com/cps/406/kb406791.html
or download via http://download.macromedia.com/pub/flashplayer/installers/current/9/install_flash_player_9_ax.exe
=================================================================================================================
To create new firefox profile run following command
firefox -P
To open/update ffprofile run following command
firefox -profile "<profile url>" 

http://girliemangalo.wordpress.com/2009/02/05/creating-firefox-profile-for-your-selenium-rc-tests/
=======================================================================
