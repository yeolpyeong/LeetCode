/**
 * @return {Function}
 */
var createHelloWorld = function() {
    let hw = "Hello World";
    
    return function(...args) {
        return hw;
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */