<template>
    <div :class="$style.wrapper">
      <button
        :class="[
          $style.button,
          primary && $style.primary,
          !primary & !disabled && $style.secondary,
          disabled && $style.disabled,
        ]"
        :type="type"
        v-bind="$props"
        :v-bind="$attrs"
      >
      </button>
    </div>  
</template>

<style lang="scss" module>
.wrapper {
  display: flex;
  justify-content: center;
  align-items: center;
  width: 100%;
  margin-top: rem(10);
}

.button {
  height: rem(35);
  width: 100%;
  border-radius: $global-border-radius;
  padding: 0 rem(10);
  user-select: none;
  @include transition(all 0.2s ease-in);
  &:hover {
    cursor: pointer;
    @include transition(all 0.2s ease-in);
  }
}

.primary {
  background-color: $global-blue;
  color: $global-white-text;
  border-color: $global-blue;
  border: rem(1) solid $global-blue;
  font-weight: bold;
  &:hover {
    background-color: $global-primary-background;
    color: $global-blue;
  }
}
.secondary {
  background-color: $global-primary-background;
  color: $global-white-text;
  border-color: $global-blue;
  border: rem(1) solid $global-blue;
  &:hover {
    color: $global-blue;
  }
}
.disabled {
  background-color: $global-lightgray;
  color: $global-light-text;
  border: rem(1) solid $global-lightgray;
  width: rem(235);
}
.helpIcon {
  font-size: rem(22);
  color: $global-transparent-grey;
  margin-left: rem(10);
}
.helpText {
  color: $global-transparent-grey;
  text-align: center;
}
</style>
