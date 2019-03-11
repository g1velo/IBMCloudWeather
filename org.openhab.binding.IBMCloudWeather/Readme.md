# Using IBM cloud service the Weather Company with openhab

This binding allows you to retrieve Weather information from the IBM Cloud service and use it in openhab. 

You will need : 
    1 ) have an IBM cloud account
    2 ) Create Weather Company Data Service 
    3 ) Create Crédentials
    4 ) Install the Binding in openhab
    5 ) configure the thing as follow : 
    
    
Thing ibmcloudweather:meteo:mythning [ user="user-provided-in-the-credential", password="password-provided-in-the-credential" , url="url-provided-in-the-credential" refresh="3600" ]

This will let you pool every Hour.