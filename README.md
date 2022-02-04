# moex-asts-change-password

### Usage

* Download appropriate [release](https://github.com/unrealwork/moex-asts-change-password/releases/tag/0.0.1) depending on ASTS Bridge type  and unpack it.

* Configure connection to ASTS bridge via `config/asts.config` 

    *`NEWPASSWORD`* is required for app.
    ```properties
    #local
    HOST=192.168.1.100:15005
    #embedded
    BROADCAST=10.63.1.255#Broadcast address for the server search to access the trading system, e.g., «10.63.1.255,10.63.3.255,10.61.1.255,10.61.3.255».
    SERVICE=gateway#Trading system service name, e.g., «gateway». Port numbers may be specified instead, e.g. 18011/18012.
    #common
    SERVER=UAT_GATEWAY
    USERID=MU9000000000
    PASSWORD=securepwd
    INTERFACE=IFCBroker42
    LANGUAGE=ENGLISH
    NEWPASSWORD=newsecurepwd
    LOGFOLDER=logs
    LOGGING=2,1
    ```

 
* Run export via binaries from `bin` directory. Specify tables as arguments. By default it will export all tables.

```sh
❯ ./bin/change_pwd.sh
16:27:23.158 [main] INFO  com.axibase.asts.client.MoexAstsClientImpl - Native libraries are successfully loaded
16:27:23.190 [main] INFO  com.axibase.asts.client.config.Configs - Loaded config from file /mnt/c/Users/unrea/dev/moex-asts-change-password-0.0.1/config/asts.config. Config : MapBasedClientConfig(hosts=[Host(hostName=192.168.1.100
, port=15005)], preferredHost=null, service=null, preferredBroadcast=null, broadcast=[], serverId=UAT_GATEWAY, userCredentials=UserCredentials(username=MU9032400002, password=******), interfaceId=IFCBroker42, tradingAccount=null, refreshInterval=PT15S, clientCode=null, optionalParams={LANGUAGE=ENGLISH, NEWPASSWORD=******, LOGFOLDER=logs, LOGGING=2,1, FEEDBACK=igor.shmagrinsky@axibase.com})
16:27:23.207 [main] INFO  com.axibase.asts.client.Clients - Default client is created.
16:27:26.382 [main] INFO  com.axibase.asts.client.MoexAstsClientImpl - Client is successfully connected to ASTS Bridge. [Host(hostName=192.168.1.100, port=15005)]
16:27:26.440 [main] INFO  com.axibase.asts.ChangePassword - Password changed. (209) Password successfully changed
16:27:26.566 [main] INFO  com.axibase.asts.client.MoexAstsClientImpl - Client disconnected from ASTS Bridge
```
