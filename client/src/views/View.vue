<template>
  <div class="view">
    <QuestionList msg="View the list of available questions in the bank!" />
  </div>
</template>

<script>
import QuestionList from '@/components/QuestionList.vue';

export default {
  name: 'Home',
  components: {
    QuestionList
  }
}
</script>
