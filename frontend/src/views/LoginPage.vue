<template>
  <div id="loginContainer" @submit.prevent="handleClickSignin">
    <base-input
      id="inpUsername"
      class="input"
      v-model="event.username"
      label="Username"
      type="text"
    />

    <base-input
      id="inpPassword"
      class="input"
      v-model="event.password"
      label="Password"
      type="password"
    />
    <base-button id="btnSubmit" class="button" @click="handleClickSignin">Login</base-button>
  </div>
</template>
<script>
import BaseInput from "@/components/BaseInput";
import BaseButton from "@/components/BaseButton.vue";
export default {
  name: "LoginPage",
  components: {
    BaseInput,
    BaseButton,
  },
  data() {
    return {
      event: {
        username: "",
        password: "",
        message: "Looks like you need to be registered!",
      },
      loginFailed: false,
      loginStatus: "",
    };
  },
  methods: {
    
  },
};
</script>
<style scoped>
#loginContainer {
  display: grid;
  justify-content: center;
  margin: 40px;
}

#loginTitle {
  font-size: x-large;
  font-weight: bold;
  margin-bottom: 20px;
}

#username,
#password {
  display: flex;
  flex-direction: row;
  align-items: center;
  column-gap: 20px;
}
</style>
