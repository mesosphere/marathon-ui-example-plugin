import {PluginHelper, PluginMountPoints} from "marathon-ui-plugin-sdk";
import ExamplePluginComponent from "./components/ExamplePluginComponent";

PluginHelper.registerMe();
PluginHelper.injectComponent(ExamplePluginComponent,
  PluginMountPoints.SIDEBAR_BOTTOM);
