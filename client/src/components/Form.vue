<template>
    <div>
    <h1>Create a Question Form</h1>
    <p>
      Fill up every parameter for the question
    </p>
    <h3>Question Title</h3>
    <p>
      What is the title of your question?
    </p>
    <input v-model="message" placeholder="edit me">
    <h3>Question Type</h3>
    <p>
      What is your question type?
    </p>
    <my-Dropdown/>
    <h3>Question Body</h3>
    <p>
      What is your question?
    </p>
    </div>
</template>
    
   

<script>
export default {

}
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