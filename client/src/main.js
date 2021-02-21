import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import DropdownButton from './components/DropdownButton/DropdownButton.vue';

Vue.config.productionTip = false;

// Globally register your component
Vue.component('my-Dropdown', DropdownButton);

new Vue({
  router,
  store,
  render: h => h(App)
}).$mount("#app");
