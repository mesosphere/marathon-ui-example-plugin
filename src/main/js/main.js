import ExamplePluginComponent from "./components/ExamplePluginComponent";

const {PluginHelper, PluginMountPoints} = window.marathonPluginInterface;

PluginHelper.registerMe();
PluginHelper.injectComponent(ExamplePluginComponent,
  PluginMountPoints.SIDEBAR_BOTTOM);
