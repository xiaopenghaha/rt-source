package java.util.prefs;

import java.util.EventListener;

@FunctionalInterface
public interface PreferenceChangeListener extends EventListener {
  void preferenceChange(PreferenceChangeEvent paramPreferenceChangeEvent);
}


/* Location:              D:\software\jd-gui\jd-gui-windows-1.6.3\rt.jar!\jav\\util\prefs\PreferenceChangeListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */