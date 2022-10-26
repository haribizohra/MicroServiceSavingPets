const Eureka = require('eureka-js-client').Eureka;
const eurekaHost = (process.env.EUREKA_CLIENT_SERVICEURL_DEFAULTZONE || 'localhost');
const eurekaPort = 8761;
const hostName = (process.env.HOSTNAME || 'localhost')
const ipAddr =  'localhost';

exports.registerWithEureka = function(appName, PORT) {
    const client = new Eureka({
        instance: {
            instanceId:appName,
            app: appName,
            hostName: hostName,
            ipAddr:ipAddr,
            port: {
                '$': PORT,
                '@enabled': 'true',
            },
            vipAddress: appName,
            dataCenterInfo: {
                '@class': 'com.netflix.appinfo.InstanceInfo$DefaultDataCenterInfo',
                name: 'MyOwn',
            },
        },
        //retry 10 time for 3 minute 20 seconds.
        eureka: {
            host: eurekaHost,
            port: 8761,
            servicePath: '/eureka/apps/',
            maxRetries: 10,
            requestRetryDelay: 2000,
        },
    })

    client.logger.level('debug')

    client.start( error => {
        console.log(error || "user service registered")
    });



    function exitHandler(options, exitCode) {
        if (options.cleanup) {
        }
        if (exitCode || exitCode === 0) console.log(exitCode);
        if (options.exit) {
            client.stop();
        }
    }

    client.on('deregistered', () => {
        process.exit();
        console.log('after deregistered');
    })

    client.on('started', () => {
        console.log("eureka host  " + eurekaHost);
    })

    process.on('SIGINT', exitHandler.bind(null, {exit:true}));
};
