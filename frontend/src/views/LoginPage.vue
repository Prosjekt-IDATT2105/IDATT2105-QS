<template>
  <div class="loginContainer" @submit.prevent="handleClickSignin">
    <BaseInput
      id="inpUsername"
      class="input"
      v-model="event.username"
      label="Username"
      type="text"
    />

    <BaseInput
      id="inpPassword"
      class="input"
      v-model="event.password"
      label="Password"
      type="password"
    />
    <button id="btnSubmit" class="button">Login</button>
  </div>
</template>
<script>
import BaseInput from "@/components/BaseInput.vue";
export default {
  name: "LoginPage",
  components: {
    BaseInput,
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
