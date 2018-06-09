
(if window-system (progn
    (set-foreground-color "white")
       (set-background-color "black")
 ))

;;keybinds
(global-set-key "\C-h" 'delete-backward-char);;C-h as backspace
(keyboard-translate ?\C-h ?\C-?);;C-h as backspace
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defun time-stamp-with-locale-c ()
  (let ((system-time-locale "C"))
    (time-stamp)
    nil))

(if (not (memq 'time-stamp-with-locale-c write-file-hooks))
    (add-hook 'write-file-hooks 'time-stamp-with-locale-c))

(setq time-stamp-format "%3a %3b %02d %02H:%02M:%02S %Z %:y")
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;                                                   
;; add 10-01-2016
;; This is 3 divisions of emacs window.
;; Split 3 vertical windows C-x + @, Split 3 horizonal windows C-x + # 
(defun split-window-vertically-n (num_wins)
  (interactive "p")
  (if (= num_wins 2)
      (split-window-vertically)
    (progn
      (split-window-vertically
       (- (window-height) (/ (window-height) num_wins)))
      (split-window-vertically-n (- num_wins 1)))))
(defun split-window-horizontally-n (num_wins)
  (interactive "p")
  (if (= num_wins 2)
      (split-window-horizontally)
    (progn
      (split-window-horizontally
       (- (window-width) (/ (window-width) num_wins)))
      (split-window-horizontally-n (- num_wins 1)))))
(global-set-key "\C-x@" '(lambda ()
                           (interactive)
                           (split-window-vertically-n 3)))
(global-set-key "\C-x#" '(lambda ()
                           (interactive)
                           (split-window-horizontally-n 3)))
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(display-time)

(tool-bar-mode 0);;tool bar disappears
(show-paren-mode t);;to make the pair blacket blink
(setq inhibit-startup-message t);;no welcome messages
(setq transient-mark-mode t);;enphasize dragged region
(setq visible-bell t);;to make display flash instead of beep signal

;;modes for various languages
(add-hook 'c-mode-hook'(lambda () (font-lock-mode 1)))
(add-hook 'c++-mode-hook '(lambda () (font-lock-mode 1)))
(add-hook 'objc-mode-hook '(lambda () (font-lock-mode 1)))
(add-hook 'html-helper-mode-hook '(lambda () (font-lock-mode 1)))
;; (add-hook 'tex-mode-hook '(lambda () (font-lock-mode 1)))
(add-hook 'latex-mode-hook '(lambda () (font-lock-mode 1)))
;; (add-hook 'java-mode-hook '       (lambda () (font-lock-mode 1)))
(add-hook 'lisp-mode-hook '       (lambda () (font-lock-mode 1)))
;;(add-hook 'font-lock-mode-hook '(lambda ()(my-font-lock-set-face)))

(add-hook 'sh-mode-hook '(lambda ()(turn-on-font-lock)))
(add-hook 'fortran-mode-hook
          '(lambda ()
             (setq comment-line-start "C")
             (abbrev-mode 1)
             (setq fill-column 72)
             (auto-fill-mode 1)
             (turn-on-font-lock)
             ))