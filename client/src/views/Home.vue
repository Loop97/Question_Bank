<template>
  <div class="home">
    <TheBase msg="Welcome to the Question Bank!" />
    <my-Dropdown/>
  </div>
</template>

<script>
// @ is an alias to /src
import TheBase from '@/components/Base.vue';

export default {
  name: 'Home',
  components: {
    TheBase,
  }
}
</script>
