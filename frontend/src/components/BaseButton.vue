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
