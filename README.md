# The JWebMP Plugin for the Font Awesome (5) Plugin

Easily add any font awesome icon into any section of your application.

Note : Font Awesome 5 Free only comes with Solid Style, but to support Pro all icons and styles are made available.


Config for Pro
-----
npm config set "@fortawesome:registry" https://npm.fontawesome.com/
npm config set "//npm.fontawesome.com/:_authToken" xxxxxxxx 

Get token from 
https://fontawesome.com/docs/web/setup/packages#_1-configure-access



Example Usage
```
FontAwesome fa = new FontAwesome(FontAwesomeStyles.Regular,FontAwesomeIcons.cog);
FontAwesome faSolid = IFontAwesome.createIcon(FontAwesomeIcons.cog,FontAwesomeStyles.Solid);
FontAwesome faLight = IFontAwesome.createIcon(FontAwesomeIcons.cog,FontAwesomeStyles.Light);

FontAwesome faMask = IFontAwesome.createMaskIcon(FontAwesomeIcons.cog,FontAwesomeStyles.Light,FontAwesomeIcons.comment_alt,FontAwesomeStyles.Regular);
faSolid.spin().transform(FontAwesomeTransforms.Grow_3,FontAwesomeTransforms.Up_4).setStyle(FontAwesomeStyles.Regular).setSize
	(FontAwesomeSizes.$4x).setIcon(FontAwesomeIcons.cogs);
```

Configuration

```
FontAwesomePageConfigurator.getConfigOptions()
			.setKeepOriginalSource(true)
			.setNestSVG();
		
FontAwesomePageConfigurator.setIncludeBrands(true);
FontAwesomePageConfigurator.setIncludeLight(true);
FontAwesomePageConfigurator.setIncludeRegular(true);
FontAwesomePageConfigurator.setIncludeSolid(true);
FontAwesomePageConfigurator.setIncludeAll(true);
//Config for your pro
FontAwesomePageConfigurator.setRootReferenceDir("path/to/pro/directory");
//Use CSS instead of new SVG
FontAwesomePageConfigurator.setFontAwesomeReferenceType(FontAwesomeReferenceType.WebFontCSS);
```

### Teamcity (https://jwebmp.com/teamcity/viewType.html?buildTypeId=JWebSwingPlugins_BuildFontAwesome5)
### Jira (https://jwebmp/jira/secure/RapidBoard.jspa?rapidView=1&projectKey=JWEB&view=planning.nodetail&epics=visible&selectedEpic=JWEB-311)
### SonarQube (https://jwebmp.com/sonar/dashboard?id=com.jwebmp%3Ajwebmp-font-awesome5&did=1)
### Plugin Source (https://fontawesome.com/)

### Built in collobaration with 
![alt BrowserStack](https://bstacksupport.zendesk.com/attachments/token/ZbwSzMlt8HaSgOBgmGVHtpTNV/?name=Logo-01.svg)
