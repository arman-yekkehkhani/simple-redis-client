# simple-redis-client

This is the client side project for [simple-redis-client](https://github.com/arman-yekkehkhani/simple-redis-server).

## How to run
Please run the following command in your terminal to start an instance of simple-redis-client:

```
cd $PROJECT_DIR
./gradlew startClient --console=plain
```

## Expected output

Here, a simple interaction with the client app is shown:

```
Simple Redis CLI
>>> set 1
ERROR: SET command accepts exactly two input params(1 provided).
>>> set 1 3
Inserted new mapping: (1-3)
>>> select 2
Current DB: 2

```

## Supported Commands

* SELECT (https://redis.io/commands/select/) 
* SET (https://redis.io/commands/set/) 
* EXPIRE (https://redis.io/commands/expire/) 
* GET (https://redis.io/commands/get/)
* DEL (https://redis.io/commands/del/) 
* EXISTS (https://redis.io/commands/exists/)
* TTL (https://redis.io/commands/ttl/)
* INCR (https://redis.io/commands/incr/)
* INCRBY (https://redis.io/commands/incrby/) 
* GETEX (https://redis.io/commands/getex/) 
* GETDEL (https://redis.io/commands/getdel/) 
* KEYS (https://redis.io/commands/keys/)
