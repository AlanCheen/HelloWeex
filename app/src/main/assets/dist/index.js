// { "framework": "Vue"} 

!function(e){function t(r){if(n[r])return n[r].exports;var o=n[r]={i:r,l:!1,exports:{}};return e[r].call(o.exports,o,o.exports,t),o.l=!0,o.exports}var n={};t.m=e,t.c=n,t.d=function(e,n,r){t.o(e,n)||Object.defineProperty(e,n,{configurable:!1,enumerable:!0,get:r})},t.n=function(e){var n=e&&e.__esModule?function(){return e.default}:function(){return e};return t.d(n,"a",n),n},t.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},t.p="",t(t.s=3)}([function(e,t,n){var r,o,s=[],i=n(1);o=r=r||{},"object"!=typeof r.default&&"function"!=typeof r.default||(o=r=r.default),"function"==typeof o&&(o=o.options),o.render=i.render,o.staticRenderFns=i.staticRenderFns,o.style=o.style||{},s.forEach(function(e){for(var t in e)o.style[t]=e[t]}),"function"==typeof __register_static_styles__&&__register_static_styles__(o._scopeId,s),e.exports=r},function(e,t){e.exports={render:function(){var e=this,t=e.$createElement;return(e._self._c||t)("text",{staticClass:["message"]},[e._v("Now, let's use Vue.js to build your Weex app.")])},staticRenderFns:[]}},,function(e,t,n){"use strict";function r(e){return e&&e.__esModule?e:{default:e}}var o=n(4),s=r(o);s.default.el="#root",new Vue(s.default)},function(e,t,n){var r,o,s=[];s.push(n(5)),r=n(6);var i=n(7);o=r=r||{},"object"!=typeof r.default&&"function"!=typeof r.default||(o=r=r.default),"function"==typeof o&&(o=o.options),o.render=i.render,o.staticRenderFns=i.staticRenderFns,o._scopeId="data-v-2964abc9",o.style=o.style||{},s.forEach(function(e){for(var t in e)o.style[t]=e[t]}),"function"==typeof __register_static_styles__&&__register_static_styles__(o._scopeId,s),e.exports=r},function(e,t){e.exports={wrapper:{justifyContent:"center",alignItems:"center"},logo:{width:"424",height:"200"},greeting:{textAlign:"center",marginTop:"70",fontSize:"50",color:"#41B883"},message:{marginTop:"30",marginRight:"30",marginBottom:"30",marginLeft:"30",fontSize:"32",color:"#727272"}}},function(e,t,n){"use strict";function r(e){return e&&e.__esModule?e:{default:e}}Object.defineProperty(t,"__esModule",{value:!0});var o=n(0),s=r(o);t.default={name:"App",components:{HelloWorld:s.default},data:function(){return{logo:"https://gw.alicdn.com/tfs/TB1yopEdgoQMeJjy1XaXXcSsFXa-640-302.png"}}}},function(e,t){e.exports={render:function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("div",{staticClass:["wrapper"]},[n("image",{staticClass:["logo"],attrs:{src:e.logo}}),n("text",{staticClass:["greeting"]},[e._v("The environment is ready!")]),n("HelloWorld")],1)},staticRenderFns:[]}}]);