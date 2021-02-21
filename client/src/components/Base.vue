<template>
  <div class="base">
    <h1>{{ msg }}</h1>
    <p>
      Enter your own questions or try out other questions in the bank.
    </p>
    <h3>View Questions</h3>
    <p>
      Click here to view available questions:
    </p>
    <router-link to="/view" tag="button">View</router-link>
    <h3>Create Questions</h3>
   <p>
      Click here to create new questions:
    </p>
    <button type="button">Create</button>
    <h3>Edit</h3>
     <p>
      Click here to edit a question:
    </p>
    <button type="button">Edit</button>
    <h3>Test</h3>
     <p>
      Click here to answer a question:
    </p>
    <button type="button">Test</button>
  </div>
</template>

<script>
export default {
  name: "TheBase",
  props: {
    msg: String
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>