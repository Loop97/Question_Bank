<template>
  <div id="dropdownbutton">
    <vue-dropdown
      :config="config"
      @setSelectedOption="setNewSelectedOption($event);"
    ></vue-dropdown>
  </div>
</template>

<script>
import vueDropdown from "./vue-dropdown";

export default {
  name: "DropdownButton",
  components: {
    vueDropdown
  },
  data: function() {
    return {
      config: {
        options: [
          {
            value: "Single-Choice Question"
          },
          {
            value: "Multiple-Choice Question"
          },
          {
            value: "Open Ended Question"
          }
        ],
        prefix: "Question",
        placeholder: "Type",
        backgroundColor: "#cde4f5",
        textColor: "black",
        borderRadius: "4px",
        border: "1px solid gray",
        width: 150
      }
    };
  },
  methods: {
    setNewSelectedOption(selectedOption) {
      this.config.placeholder = selectedOption.value;
    }
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
